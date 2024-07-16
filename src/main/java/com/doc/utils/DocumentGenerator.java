package com.doc.utils;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class DocumentGenerator {

    private DocumentGenerator(){}

    public static String generatePdfBase64(String processedHtml){
        String base64 = "No Base64";
        try{
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PdfWriter pdfWriter = new PdfWriter(outputStream);
            ConverterProperties converterProperties = new ConverterProperties();
            DefaultFontProvider fontProvider =
                    new DefaultFontProvider(false, true, false);
            converterProperties.setFontProvider(fontProvider);
            HtmlConverter.convertToPdf(processedHtml, pdfWriter, converterProperties);
            pdfWriter.flush();
            outputStream.flush();
            base64 = Base64.getEncoder().encodeToString(outputStream.toByteArray());
          //  saveAsPdf(outputStream.toByteArray());
            outputStream.close();
            pdfWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return base64;
    }

    private static void saveAsPdf(byte[] data){
        try{
            FileOutputStream out = new FileOutputStream("F:\\html\\"+System.currentTimeMillis()+".pdf");
            out.write(data);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
