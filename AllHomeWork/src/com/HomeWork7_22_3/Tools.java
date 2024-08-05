package com.HomeWork7_22_3;

//①public int convertInt(String number) throws ConvertException
////②public double convertDouble(String number) throws ConvertException
////③public float convertFloat(String number) throws ConvertException
////④public short convertShort(String number) throws ConvertException
////⑤ public byte convertByte(String number) throws ConvertException
////如果转换失败，抛出ConvetException异常。
public class Tools {
    public class ConvertException extends Exception {
        public ConvertException(String message) {
            super(message);
        }
    }

    public int convertInt(String number) throws ConvertException {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new ConvertException("Failed to convert to int: " + number);
        }
    }


    public double convertDouble(String number) throws ConvertException {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new ConvertException("Failed to convert to double: " + number);
        }
    }


    public float convertFloat(String number) throws ConvertException {
        try {
            return Float.parseFloat(number);
        } catch (NumberFormatException e) {
            throw new ConvertException("Failed to convert to float: " + number);
        }
    }


    public short convertShort(String number) throws ConvertException {
        try {
            return Short.parseShort(number);
        } catch (NumberFormatException e) {
            throw new ConvertException("Failed to convert to short: " + number);
        }
    }


    public byte convertByte(String number) throws ConvertException {
        try {
            return Byte.parseByte(number);
        } catch (NumberFormatException e) {
            throw new ConvertException("Failed to convert to byte: " + number);
        }
    }
}










