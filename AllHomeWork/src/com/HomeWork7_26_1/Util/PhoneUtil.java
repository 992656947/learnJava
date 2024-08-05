package com.HomeWork7_26_1.Util;

import com.HomeWork7_26_1.CallType;
import com.HomeWork7_26_1.Phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneUtil {
    private static final String Phone_Config_Path = "HomeWork7_26_1";
    public static List<Phone> gePhoneListFromFile(){
        List<Phone> list = new ArrayList<>();
        Reader reader = null;
        BufferedReader bufferedReader = null;


        try {
            reader = new FileReader(new File((Phone_Config_Path)));
            bufferedReader = new BufferedReader(reader);

            String content = null;
            while ((content=bufferedReader.readLine())!=null){
                String phoneData[] = content.split("\\|");
                Phone phone = new Phone();
                phone
            }
        }
    }


    public static CallType getCallType(String value){
        CallType callType = null;
        switch (value){
            case "1":
                return CallType.CITY;
                break;
            case "2":
                return CallType.PROVINCE;
                break;
            case "3":
                    return CallType.INTER_NATIONAL;
                    break;


        }
        return callType;
    }


}


























