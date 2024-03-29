package com.tirthhihoriya;

import java.io.*;
import java.util.Scanner;

class Login {

    String uid;
    private String pass;

    void register(Login u) throws IOException
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("\n\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int c;
        do{
            c=0;
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tWelcome! New User.\n\n");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\tSet User Id : ");
            u.uid = sca.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\tSet pass: ");
            u.pass=sca.nextLine();
            if(u.uid.length()==0 || u.pass.length()==0 || u.uid.charAt(0)=='.')
            {
                System.out.println("Enter valid user id or password...!!!");
                c=-1;
            }


        }while(c==-1);


        File f2= new File("./"+u.uid);

        if(f2.mkdirs())
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\tYou are successfully registered!!\n\t\t\t\t\t\t\t\t\tNote:- Please remember your details for future use.");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        File f3= new File("./"+u.uid+"/pass.txt");
        final var newFile = f3.createNewFile();

        BufferedWriter bf =new BufferedWriter(new FileWriter(f3));
        bf.write(u.pass);

        bf.close();
    }

    boolean login(Login u)
    {
        Scanner sca = new Scanner(System.in);

        System.out.println("\n\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\tEnter your login details.\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\tUser Id: ");
        u.uid=sca.nextLine();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\tPassword: ");
        u.pass=sca.nextLine();
        File f;
        String read;
        try {
            f = new File("./" + u.uid);
            BufferedReader br = new BufferedReader(new FileReader("./" + u.uid + "/pass.txt"));
            read = br.readLine();

            br.close();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        catch (Exception e)
        {
            return false;
        }
        return f.isDirectory() && read.equals(u.pass);
    }

}
