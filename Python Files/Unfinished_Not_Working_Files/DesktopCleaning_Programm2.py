import os
import getpass
username = getpass.getuser()
 
Loop = True
 
path = r'C:\Users\User\Videos' #Which path should be scanned
 
files = os.listdir(path) #makes a list of all file names

#first_Two_Letters = files[I][1:2]
#Fach = files[I][3:5]
 

while Loop:
    datei = input("Fachedndung ohne Punkt oder A zum Allstar Modus / E to Exit : ")  #ersten 2 buchstaben von der Abkürzung von einer Datei(z.b Sa für Schulaufgaben)


    if datei != "E" and datei != "A": #Checks if the input isnt E # files ==datei?
        I = 0  #Counter Start
        first_Two_Letters = files[I][1:2]
        Fach = files[I][3:5]

 
        while I < len(files): #Checks if the Counter is lower than the length of the List
            DateiA = files[I] #gets the string from the list
                if not os.path.exists(fr"C:\Users\{username}\Desktop\Schule\.{Fach}"): #Checks if the Underfolder exist            
                    os.makedirs(fr"C:\Users\{username}\Desktop\Schule\.{Fach}") #Creates Underfolder
                    os.system(fr"move C:\Users\{username}\Desktop\*.{Fach} C:\Users\{username}\Desktop\Schule\.{Fach}") #Moves File to Folder
                    if len(os.listdir(fr"C:\Users\{username}\Desktop\Schule\.{Fach}")) == 0: #Checks if the Folder has more than one File
                        os.rmdir(fr"C:\Users\{username}\Desktop\Schule\.{Fach}") #If it doesnt deletes it
                        I = I+1 #Adds one to the counter

                else:
                    os.system(fr"move C:\Users\{username}\Desktop\*.{Fach} C:\Users\{username}\Desktop\DesktopCleaningOrdner\.{Fach}") #Moves File to Folder
                    I = I+1 #Adds one to the counter


               
            else:
                os.system(fr"move C:\Users\{username}\Desktop\*.{Fach} C:\Users\{username}\Desktop\Schule\.{datei}") #Moves File to Folder
            
    elif datei == "E":
        Loop = Loop = False #Ends Loop




        #start programming from the start and dont include folders at first