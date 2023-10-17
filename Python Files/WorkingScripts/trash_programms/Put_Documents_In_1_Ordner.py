import os
import getpass
username = getpass.getuser()

newpath = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner'   #Hier macht man einen neuen ordner
if not os.path.exists(newpath):
  os.makedirs(newpath)



#Alle_Desktop_Ordner = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Alle_Desktop_Ordner'   #Hier macht man einen neuen ordner
#if not os.path.exists(Alle_Desktop_Ordner):
#  os.makedirs(Alle_Desktop_Ordner)
#os.system(fr'C:\Users\{username}\Desktop\*.ovm C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Alle_Desktop_Ordner') 





Text = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Text_Dokumente'
if not os.path.exists(Text):
  os.makedirs(Text)

os.system(fr'move C:\Users\{username}\Desktop\*.txt C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Text_Dokumente') 
# dabei sollte man drauf achten den * für alle arten von der textsorten (z.b txt) einzusetzten

#os.system(move fr'C:\Users\{username}\Desktop*.txt C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Text_Dokumente')






Word = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Word_Dokumente'
if not os.path.exists(Word):
  os.makedirs(Word)

os.system (fr'move C:\Users\{username}\Desktop\*.docx C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Word_Dokumente') 
# dabei sollte man drauf achten den * für alle arten von der textsorten (z.b txt) einzusetzten








Exel = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Exel_Dokumente'
if not os.path.exists(Exel):
  os.makedirs(Exel)

os.system(fr'move C:\Users\{username}\Desktop\*.xlsx C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Exel_Dokumente')


  




Batch = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Batch_Dokumente'
if not os.path.exists(Batch):
  os.makedirs(Batch)

os.system(fr'move C:\Users\{username}\Desktop\*.bat C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Batch_Dokumente')








toc_Datei = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\toc_Datei'
if not os.path.exists(toc_Datei):
  os.makedirs(toc_Datei)

os.system(fr'move C:\Users\{username}\Desktop\*.toc C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\toc_Datei')  








zipDatei = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\zip_Datein'
if not os.path.exists(zipDatei):
  os.makedirs(zipDatei)

os.system(fr'move C:\Users\{username}\Desktop\*.zip C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\zip_Datein')







Everything_Else = fr'C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else'
if not os.path.exists(Everything_Else):
  os.makedirs(Everything_Else)

os.system(fr'move C:\Users\{username}\Desktop\*.md C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.in C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.cfg C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.mcmeta C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.mp3 C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.png C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.jng C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.py C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')       
os.system(fr'move C:\Users\{username}\Desktop\*.vsb C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.bmp C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')
os.system(fr'move C:\Users\{username}\Desktop\*.log C:\Users\{username}\Desktop\Desktop_Cleaning_Ordner\Everything_Else')

 