package controller;

import java.util.HashMap;

class DataBase
{
  HashMap<String , String >  userlogin = new HashMap<String,String>();
    public void writeDataToFile() 		
    {
        
    }		
    
    public void readDataFromFile() 		
    {
        
    }		
    
    public void usersLogInUpdate(String command)
    {

            if (command.substring(13,21).equalsIgnoreCase("username")) {
                String[]  b	=(command.split("--"));
                String username  = b[1].replaceAll(".*\\<|\\>.*", "");
                String password  = b[2].replaceAll(".*\\<|\\>.*", "");
                userlogin.put(username,password);
                new UserController();
            }
            if (command.substring(13,21).equalsIgnoreCase("password")) {
                String[]  b	=(command.split("--"));
                String password  = b[1].replaceAll(".*\\<|\\>.*", "");
                String username  = b[2].replaceAll(".*\\<|\\>.*", "");
                userlogin.put(username,password);
                new UserController();
            }
        }




    
    public void usernameUpdate() 		
    {
        
    }		
    
    public void passwordUpdate() 		
    {
        
    }		
    
    public void nicknameUpdate() 		
    {
        
    }		
    
    public void userScoresUpdate() 		
    {
        
    }
     public boolean userLoginCheck (String command ){
         return !command.startsWith("user login");
     }

}
