package com.doc.exception;

import org.apache.commons.lang3.StringUtils;

import java.io.StringWriter;

public class ExceptionUtility {

    private ExceptionUtility() {
    }

    public static String writeExceptionAsString(Exception e){
        StringWriter stringWriter = new StringWriter();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for(StackTraceElement element: stackTrace){
            stringWriter.write(element.toString());
        }
        return stringWriter.toString();
    }
}
