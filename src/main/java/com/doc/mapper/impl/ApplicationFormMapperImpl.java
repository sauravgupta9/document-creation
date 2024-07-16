package com.doc.mapper.impl;

import com.doc.mapper.ApplicationFormMapper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class ApplicationFormMapperImpl implements ApplicationFormMapper {


    @Override
    public Context setApplicationFormData() {
        Context context = new Context();
        try{
            Map<String, Object> objectMap = new HashMap<>();

            objectMap.put("first","John");
            objectMap.put("last","D'cruz");
            objectMap.put("major","Medical Account");
            objectMap.put("deliverydate", LocalDate.now());
            objectMap.put("addressline1","Old Tehsil Road");
            objectMap.put("addressline2","Bada Bazar");
            objectMap.put("country","India");
            objectMap.put("city","Sabalgarh");
            objectMap.put("region","Morena");
            objectMap.put("pincode","476229");
            objectMap.put("email","testing@gmail.com");
            objectMap.put("phone","99999999");
            objectMap.put("choice1",false);
            objectMap.put("choice2",false);
            objectMap.put("choice3",true);
            objectMap.put("dateOfOrder",LocalDate.now());
            objectMap.put("patient","Dereck O'brian");
            objectMap.put("illness","Typhoid");
            objectMap.put("medicine","Vick Vaporub");
            objectMap.put("complaint","No");
            objectMap.put("price","76867");
            objectMap.put("Month","September");
            context.setVariables(objectMap);
        }catch (Exception e){
            e.printStackTrace();
        }
        return context;
    }
}
