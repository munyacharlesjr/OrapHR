# chinhoyi-hr
HR system for Charles Moyo from Chinhoyi university

System Requirements
  
 1) Git ( https://www.atlassian.com/git/tutorials/install-git )
   
 2) Gradle ( https://gradle.org/install/ )
   
 3) IntelliJ ( https://treehouse.github.io/installation-guides/windows/intellij-idea-win.html )
   
 4) Java 8 ( https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html )
   
 5) H2 Database ( http://zetcode.com/java/h2database/ ). 
Once DB is installed follow "DB Init instructions" below

Some Git alternatives to import, create or clone <br/>
   
 1) Create a new repository <br/>
       git clone https://{repository-url}.git <br/>
       cd trade-data <br/>
       touch README.md <br/>
       git add README.md <br/>
       git commit -m "add README" <br/>
       git push -u origin master <br/>

   
 2) Existing folder <br/>
       cd existing_folder <br/>
       git init <br/>
       git remote add origin https://{repository-url}.git <br/>
       git add . <br/>
       git commit -m "Initial commit" <br/>
       git push -u origin master <br/>

   
 3) Existing Git repository <br/>
       cd existing_repo <br/>
       git remote rename origin old-origin <br/>
       git remote add origin https://{repository-url}.git <br/>
       git push -u origin --all <br/>
       git push -u origin --tags <br/>
       
   
 4) Import an existing repository <br/>
       git clone https://{repository-url}.git  


To compile and build the code, either
   
 1) In the IDE Terminal view type "gradle clean build" and hit "Enter"
   
 2) Or use your OS command-line view to do the above. Note: You need to be in the "chinhoyi-hr" root folder to do this
   
 3) Or in the IDE open the Gradle view to execute the "clean" and "build" tasks in succession. <br/>
   Any of the above actions should create a "*build/libs/chinhoyi-hr-{current-version}.jar*" file within the chinhoyi-hr root folder.
   
 
DB Init instructions
   
 1) To create the local DB\
      in the root "h2" folder run "*java -cp bin/h2-1.4.199.jar org.h2.tools.Shell*".<br/>
      You will be prompted to type the URL like below:<br/>
          *Welcome to H2 Shell 1.4.199 (2019-03-13).* <br/>
          *Exit with Ctrl+C.* <br/>
          *[Enter] jdbc:h2:~/test.* <br/>
          *URL* <br/>       
          *[Enter] org.h2.Driver* <br/>
          *Proceed to type "*jdbc:h2:~/tmp/h2dbs/test*" for the URL. The other values are defaults.* <br/>
          The rest of the command-line prompt will be like below: <br/>
          *[Enter]* <br/>
          *User* <br/>      
          *Password  Password*  <br/>
          *Type the same password again to confirm database creation.* <br/>
          *Password  Password*  <br/>
           Proceed to type "sa" for the User and leave blank for the password <br/>
           On completion exit the "sql" prompt with [CRTL - C] <br/>
      
   
 2) To create the DB tables
      Still on the "h2" root folder run "*java -jar bin/h2-1.4.199.jar -baseDir ~/tmp/h2dbs*" <br/>
      This will open the DB view on your default browser. <br/>
      Connect to it and run sql commands in the "*resources/database*" folder.<br/>
      
Make sure to exit the Database once tables have been successfully created.<br/>
  
  
To Run the application, either
   
 1)    On the command line, run "*java -jar build/libs/chinhoyi-hr-{current-version}.jar*"
   
 2) Or in IDE right-click the above jar and select "Run" or "Debug" (if you want to debug)
      
      
      