package com.Sajid;



import java.util.Scanner;



        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                String section;
                System.out.print("Enter section : ");
                section = input.next();
                System.out.println("section:" + section);


                Info myInfo = new Info();
                String name = "Sajid";
                int id = 2012020094;
                System.out.println("Name: "+name );
                System.out.println("Id: "+id);

                Hobby myHobby = new Hobby();
                String hobbyName = "Reading";
                System.out.println("Hobby: "+hobbyName);




                /* name Sajid Ispak Choudhury
                   id 2012020094
                   section B
                   email sajidispak699@gmail.com
                   date 16/07/21

                 */
            }
        }





