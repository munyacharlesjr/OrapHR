
/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */
package com.hr.charles.app.chinhoyihr.domain;

import com.hr.charles.app.chinhoyihr.model.SalarySlip;
import com.hr.charles.app.chinhoyihr.repository.ConnectionClass;
import com.hr.charles.app.chinhoyihr.model.PersonalInfo;
import com.hr.charles.app.chinhoyihr.ui.views.salaryslips.SalarySlipDetail;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */

public class SalaryHandling {
    
    private static ArrayList<SalarySlip> ss = new ArrayList<>();
    
     public static boolean load()
     {
         if(!ss.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from salaryslip;");
                       
        try{
            while(resultSet.next()){
            ss.add(new SalarySlip(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(),
                   resultSet.getObject(3).toString(),resultSet.getObject(4).toString(), Integer.parseInt(resultSet.getObject(5).toString()), 
                   Double.parseDouble(resultSet.getObject(6).toString()), Double.parseDouble(resultSet.getObject(7).toString()), 
                   Double.parseDouble(resultSet.getObject(8).toString()),resultSet.getObject(9).toString()));
            }
            System.out.println("loaded with size of " + ss.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     
     
     
     public static void save(SalarySlip ssc)
     {       
        try {
             PersonalInfo personalInfo = PersonalHandling.searchByID(ssc.getId());
             
             if(personalInfo==null)
                 throw new IllegalArgumentException("No Record Found Against ID " + ssc.getId());
             
             ssc.setNetSalary(personalInfo.getSalary());
             ssc.setName(personalInfo.getName());
            ssc.setPost(personalInfo.getPost());
            
            ConnectionClass.query("insert into salaryslip(sr, name, post, month, days, advance, deduction, net_salary, date, gross_salary)" +
                 "values ("+ ssc.getId()+", '"+ ssc.getName()+"', '"+ ssc.getPost() +"', '"+ssc.getMonthName() +"', "+ ssc.getTotalWorkingDays()+","+ ssc.getAdvance()+
                 ", "+ ssc.getDeduction() +" , " + ssc.getNetSalary() + " ,'" + ssc.getDate() + "' , " + ssc.getGross() +");");
            
            ss.add(ssc);
            new SalarySlipDetail(null, true, ssc).setVisible(true);
            
         }catch(IllegalArgumentException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
       public static void unique(SalarySlip ssc)
     {
         for (int i = 0; i < ss.size(); i ++)
         {
             if (ssc.getId() == ss.get(i).getId())
                  throw new IllegalArgumentException("Record against this ID '"+ssc.getId()+"' is already exist ");    
         }
     }
       
      
      public static void arrayDispose()
    {
        ss.clear();
    }
      
      public static SalarySlip searchByID(int id)
    {
        try
        {
            load();
            for(int i=0; i<ss.size(); i++)
            {
                if(ss.get(i).getId()==id)
                    return ss.get(i);
            }
        }catch(Exception e){
        }
        return null;        
    }
      
    public static ArrayList<SalarySlip> getArray()
   {
       return ss;
   }
    
    
       public static void DeleteRecord(SalarySlip ssc)
   {
       try {
       load();
             
       ConnectionClass.query("DELETE FROM salaryslip WHERE sr = "+ ssc.getId() + ";");
      
       }catch(Exception e)
       {
            throw new IllegalArgumentException(e.getMessage());
       }
       
      
   }
      public static void UpdateRecord(SalarySlip ssc)
   {
       try {
       
       load();
     
       ConnectionClass.query("UPDATE salaryslip SET name = '" + ssc.getName()  + "', post = '"+ ssc.getPost() +
               "', month = '"+ ssc.getMonthName() + "', days = '" + ssc.getTotalWorkingDays()+ "', advance = '" + ssc.getAdvance()
               + "', deduction = '"+ ssc.getDeduction() + "', net_salary = '" + ssc.getNetSalary() + "', date = '" + ssc.getDate()
               +"', gross_salary = '" + ssc.getGross() +"'WHERE sr = " + ssc.getId() +" ;");
       
       }catch(Exception e)
       {
          throw new IllegalArgumentException(e.getMessage());
       }
         
   }
      
     
    
}

