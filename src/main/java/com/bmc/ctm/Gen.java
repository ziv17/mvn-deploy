package com.bmc.ctm;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Hello world!
 *
 */
public class Gen
{
    public static String gen_message()
    {
        String[] numbers = {"1", "2", "3", "4"};
        numbers = ArrayUtils.add(numbers, "5");
        System.out.printf("Hash:%s.\n", ArrayUtils.hashCode(numbers));
        int randomInt = (int) (Math.random() * 4);
        return numbers[randomInt];
    }
}
