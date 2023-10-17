import os
import getpass
username = getpass.getuser()
 
Loop = True
 
#os.system(fr"move C:\Users\{username}\Desktop\*.txt C:\Users\{username}\Desktop\DesktopCleaningOrdner")  
 
#datei = input("Welche Dateiendung ohne punkt / E to exit: ")
     
#os.system(fr"move C:\Users\{username}\Desktop\*.{datei} C:\Users\{username}\Desktop\DesktopCleaningOrdner")
 
expec = ['bat','dll','Plugins','pdb','txt','docx','toc','zip','xlsx','md','in','cfg','mcmeta','mp3','png','jng','py','vsb','bmp','log','accdb','rtf','odg','pub','pptx','7z','vbs','exe','scr','cmd','com','pdf','xlsm','xlsb','doc','jpeg','gif','dot','dotx','ppt','rar','html','htm','mpg','mpeg','wmv','exe','dotm','mht','mhtml','odt','csv','apk','c','c++','cab','jar','mp4','pps','jpg']
   
while Loop:
    datei = input("Dateiedndung ohne Punkt oder A zum Allstar Modus / E to Exit : ")
    if datei != "E" and datei != "A": #Checks if the input isnt E
        if not os.path.exists(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}"): #Checks if the Underfolder exists
                os.makedirs(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}") #Creates Underfolder
                os.system(fr"move C:\Users\{username}\Desktop\*.{datei} C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}") #Moves File to Folder
                if len(os.listdir(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}")) == 0: #Checks if the Folder has more than one File
                    os.rmdir(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}") #If it doesnt deletes it
        else:
            os.system(fr"move C:\Users\{username}\Desktop\*.{datei} C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{datei}") #Moves File to Folder
    elif datei == "A":
        I = 0 #Counter Start
        while I < len(expec): #Checks if the Counter is lower than the length of the List
            DateiA = expec[I] #gets the string from the list
            if not os.path.exists(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}"): #Checks if the Underfolder exists
                os.makedirs(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}") #Creates Underfolder
                os.system(fr"move C:\Users\{username}\Desktop\*.{DateiA} C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}")
                if len(os.listdir(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}")) == 0: #Checks if the Folder has more than one File
                    os.rmdir(fr"C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}") #If it doesnt deletes it
                I = I+1 #Adds one to the counter
            else:
                os.system(fr"move C:\Users\{username}\Desktop\*.{DateiA} C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{DateiA}") #Moves the file to the folder
                I = I+1 #Adds one to the counter
 
 
    elif datei == "E":
        Loop = Loop = False #Ends Loop