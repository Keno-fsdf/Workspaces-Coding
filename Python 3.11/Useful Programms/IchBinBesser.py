import requests
import time
import winsound
import keyboard
import threading


# import pygame 

# pygame.mixer.init()
# pygame.mixer.music.load(r"Python 3.11\Useful Programms\benachrichtigungSound.wav")

# webseite = input ("Webseite, die überprüft werden soll: ")
# webseite = "elearning.thws.de/course/view.php?id=24897"

# sound = AudioSegment.from_wav(r"Python 3.11\Useful Programms\benachrichtigungSound.wav ")
# quieter_song = sound - 3
# play(quieter_song)






webseite  = "https://elearning.thws.de/course/view.php?id=24897"
webseitenotFound = True
while webseitenotFound ==True:
    time.sleep(5)
    try:
        respone = requests.get(webseite) 
        
        webseitenotFound = False
        print(respone)
        print("Press:      ctr  +   c       to end the programm")
        
        while webseitenotFound == False:
            winsound.PlaySound(r"Python 3.11\Useful Programms\benachrichtigungSound.wav",0)
            time.sleep(3)
            winsound.PlaySound(r"Python 3.11\Useful Programms\benachrichtigungSound.wav",0)



    except: 
        print("Website is not available")
        print("skfjksdjfdksjfksj")


