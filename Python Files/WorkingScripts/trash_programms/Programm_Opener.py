import os
import subprocess
import keyboard

# CHROME = os.path.join('C:\\', 'Program Files (x86)', 'Google', 'Chrome', 'Application', 'chrome.exe')
# os.system('taskkill /im chrome.exe')
# subprocess.call([CHROME, '--kiosk'])


import keyboard  # using module keyboard
while True:  # making a loop
    try:  # used try so that if user pressed other than the given key error will not be shown
        if keyboard.is_pressed('F8'):  # if key 'q' is pressed 
            
            os.startfile('calc.exe')
            break  # finishing the loop
        if keyboard.is_pressed('F7'):
            MINECRAFT = os.path.join('C:\\', 'Program Files (x86)', 'Minecraft Launcher', 'MinecraftLauncher.exe')
            os.system('taskkill /im MinecraftLauncher.exe')
            subprocess.call([MINECRAFT, '--kiosk'])
     expect:
            break  # if user pressed a key other than the given key the loop will break







# MINECRAFT = os.path.join('C:\\', 'Program Files (x86)', 'Minecraft Launcher', 'MinecraftLauncher.exe')
# os.system('taskkill /im MinecraftLauncher.exe')
# subprocess.call([MINECRAFT, '--kiosk'])
 
 
 
 
 
 
# VISUAL_STUDIO = os.path.join('C:\\','Program Files (x86)', 'Minecraft Launcher', 'MinecraftLauncher.exe')
# os.system('taskkill /im Microsoft VS Code\Code.exe')
# subprocess.call([VISUAL_STUDIO, '--kiosk'])




#os.startfile('calc.exe')



#'C:\\', 'Users', 'User', 'AppData','Roaming','Microsoft','Windows','Start Menu','Programs','Discord Inc'
#
# Open a page with Chrome through Python

# import webbrowser
# chromedir= 'C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s'
# webbrowser.get(chromedir).open("https://pythonprogramming.altervista.org/wp-admin")
# 1
# 2
# 3
# 4
# 5
# Open a page with Chrome through Python
 
# import webbrowser
# chromedir= 'C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s'
#webbrowser.get(chromedir).open("https://pythonprogramming.altervista.org/wp-admin")