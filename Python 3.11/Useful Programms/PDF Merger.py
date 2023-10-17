import PyPDF2 
from PyPDF2 import PdfMerger
import sys
import os
import easygui
import pyautogui
from pyautogui import*
from time import sleep

input('This merges multiple pdf-documents into one, Press ENTER to continue')  


pdfs = easygui.fileopenbox("Pls select the pdf documents that should be merged together",multiple=True) # Danach fixen, es gibt ein error code wenn ich multiplie mache

print (pdfs)
#I Wanna do it so i can just select the pdf von einem ordner, also der ordner öffnet sich und ich kann es auswählen 
#dafür muss es automatisch den Path bekommen

input('Above you can see your document, Press ENTER to continue')  
counter = 0

while len(pdfs)> counter:
    if pdfs[counter].endswith("pdf"):
        print ("Document Number", [counter],"is pdf")
        counter =counter +1

    else: 
        print ("Error has occurred, maybe not all Files are pdfs") 
        exit()

merger = PdfMerger()

Naming_the_File = input("Enter the File Name:   ")

for pdf in pdfs:
    merger.append(pdf)

merger.write(fr"C:\Users\Keno\Desktop\{Naming_the_File} .pdf")
merger.close()

print (fr"C:\Users\Keno\Desktop\{Naming_the_File} .pdf")
input('Above you can see the path of your new document, Press ENTER to continue')
 