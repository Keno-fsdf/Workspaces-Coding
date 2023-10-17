import re
import os
import getpass
import shutil
username = getpass.getuser()

#Fach = files[I][3:5]

path = r'C:\Users\User\Music\MEmu Music' #Which path should be scanned
 
files = os.listdir(path) #makes a list of all file names
#print(files)
Loop = True
I = 0
datei = input("Fachedndung ohne Punkt oder A zum Allstar Modus / E to Exit : ")  #ersten 2 buchstaben von der Abkürzung von einer Datei(z.b Sa für Schulaufgaben)
print(files)


while I <len(files):

	
	first_Two_Letters = files[I][0:2]
	print (first_Two_Letters)
	if first_Two_Letters == datei:
		Fach = files[I][2:5]
		print("worked")
		Name_of_The_File = (files[I])
		if not os.path.exists("C:\\Users\\User\\Desktop\\Schule\\" + Fach):
			os.makedirs("C:\\Users\\User\\Desktop\\Schule\\" + Fach)

			shutil.move('C:\\Users\\User\\Music\\MEmu Music\\' + Name_of_The_File, "C:\\Users\\User\\Desktop\\Schule\\"+ Fach)
			I = I +1
		else:
			shutil.move('C:\\Users\\User\\Music\\MEmu Music\\' + Name_of_The_File, "C:\\Users\\User\\Desktop\\Schule\\" + Fach)
			I = I +1
		

	else: 
		
		print("didnt work")
		Name_of_The_File = (files[I])
		I = I +1	




# Now i gotta make it scan more of my pc and maybe make an allstar mode