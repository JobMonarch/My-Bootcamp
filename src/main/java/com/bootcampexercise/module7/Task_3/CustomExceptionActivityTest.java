package com.bootcampexercise.module7.Task_3;

public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try { //tests with different names
            obj.validateUser("Yusuf");     // valid
            obj.validateUser("Thakur");     // invalid
            obj.validateUser("SpongeBob");   // valid
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {

        String[] validUsers = {"John", "Yusuf", "Shanti", "SpongeBob"}; //the array of valid users

        int flag = 0;

        for (String validUser : validUsers) {

            if (validUser.equals(name)) { //checks if name exists in array
                flag = 1;
                break;
            }
        }

        if (flag == 0) {//throws exception if name not found
            throw new CustomExceptionActivity();
        }

        else { //enters if found
            System.out.println("Welcome to Payroll program");
        }
    }
}
