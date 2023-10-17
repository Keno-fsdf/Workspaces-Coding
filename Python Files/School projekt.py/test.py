from pynput import keyboard
import time
from datetime import datetime
#an dem wochen button arbeiten
#Code sauber machen und übersichtlicher
# zweite version von dem programm erst einzel in einem anderen file programmieren
# die beiden programme zusammenfügen

Scores_per_school_hour = []
Scores_per_school_day = []
count = 0
Stunde = 1

def add():
    global count
    count = count +1
    print (count)

NeuerTag_OderDERGleicheTAg = input("ist eine Neuer Tag angebrochen oder ist es immernoch der gleiche tag (Drücke 2 für der gleiche TAg und 1 für einen neuen TAg:   ")
if  NeuerTag_OderDERGleicheTAg == "1":


    saveFile3 = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a")
    Tag = input("Welcher Tag ist heute:     ")
    saveFile3.write('\n')
    saveFile3.write('\n')
    saveFile3.write(Tag)
    saveFile3.write('\n')
    saveFile3.close()

else:
    saveFile10 = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a")    


    saveFile10.write('\n')
    
    saveFile10.write('\n')
    
    saveFile10.write('\n')

    saveFile10.close()


#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm
#maybe make a if statement that asks if a new day has begun so i can continue the day if i accidently closed the programm






break_program = False
def on_press(key):
    global break_program
    print (key)

    if key == keyboard.Key.insert:
        add()
    
    if key == keyboard.Key.delete:
        global Stunde
        global count
        print("Neue Schulstunde")
        Scores_per_school_day.append(count)
        print(Scores_per_school_day)
        saveFile = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a") #global
        saveFile.write( str(Stunde) + " Stunde"+ ": " +str(count) + '\n')       
        saveFile.close()
        count = 0
        Stunde = Stunde + 1
        print(Stunde)

    if key == keyboard.Key.home:
        saveFile2 = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a") #global
        print("Neuer Schultag")
        saveFile2.write('\n' + "Tagesresultat: " + str(Scores_per_school_day))
        saveFile2.write('\n' + "Insgesamte Meldungen: "   + str(sum(Scores_per_school_day)))
        saveFile2.close()
        saveFile5 = open (r"C:\Users\User\Documents\Python Scripts\Week.txt","a") #Muss die Zahlen rauslesen #ich muss die zahlen in des document reinschreiben
        saveFile5.write(str(sum(Scores_per_school_day ) ) + "\n")  #Ich speicher des in einem extra document und wenn ich den pagu up button drücke überschreibe ich alle mit der write       
        saveFile5.close()
                        #ich möchte alle meldung zusammen addieren
        
    if key == keyboard.Key.page_up:
        print("worked")
        Datum = datetime.now()
        RichtigesDatum = str(Datum)
        EchtesDatum = RichtigesDatum[0:10]
        saveFile4 = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a")
        saveFile4.write( '\n'+'\n' + '\n' + '\n' + "Ergebnis von der Woche :" +str(EchtesDatum) + '\n')
        saveFile4.close()
       
     
        saveFile6= open (r"C:\Users\User\Documents\Python Scripts\Week.txt","r")
        read = saveFile6.readlines()
        newList = []
        for line in read:
            newList.append(int (line[:-1]))
            print(newList)
        saveFile6.close()
       

      
        saveFile7 = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a")
        Summe =(str(sum(newList)))
        saveFile7.write("\n" + "Insgesamte Meldungen: "+ Summe + "\n" + "\n" + "\n" + "\n" + "\n")
        saveFile7.write("\n" + "\n" + "\n" + "\n" + "\n" + "\n")
        saveFile7.close()

        saveFile8= open (r"C:\Users\User\Documents\Python Scripts\Week.txt","w")
        saveFile8.write("")
        saveFile8.close





     
    elif key == keyboard.Key.end:
        print ('end pressed')
        break_program = True
        return False

with keyboard.Listener(on_press=on_press) as listener:
    while break_program == False:
        print ('program running')
        time.sleep(5)
    listener.join()




                        