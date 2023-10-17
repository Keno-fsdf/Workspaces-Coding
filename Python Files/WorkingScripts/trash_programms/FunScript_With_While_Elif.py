#!/usr/bin/env python
import pyglet
import sys
Loop = True
test_text = input ("Enter 1 for Fun or 2 for Suprise, If you are cool you will write 2: ")
test_number = int(test_text)
if test_number>2:
    Loop==True
elif test_number == 1 or test_number == 2:
    Loop==False


if test_number==1:
    song = pyglet.media.load(r'C:\Users\User\Downloads\windows_error_remix.mp3')
    song.play()
    pyglet.app.run()
    sys.exit()
    

elif test_number ==2:
    song = pyglet.media.load(r'C:\Users\User\Downloads\fnaf_2_death_scream.mp3')
    song.play()
    pyglet.app.run()
    sys.exit()
    
elif test_number < 2: #ich sollte einfach machen , dass wenn es nicht 1 oder 2 ist , diese nachricht kommt egal ob es buchstaben oder zahlen sind
    print('Jo drück doch einfach 1 oder 2 bist dumm')
    test_text = input ("Enter 1 for Fun or 2 for Suprise, If you are cool you will write 2: ")
# funktoniert nicht wenn man buchstaben benutzt

while Loop ==True:
    if test_number>2:
        Loop==True
    elif test_number == 1 or test_number == 2:
        Loop==False


    print('Jo drück doch einfach 1 oder 2 bist dumm')
    test_text = input ("Enter 1 for Fun or 2 for Suprise, If you are cool you will write 2: ")
    test_number = int(test_text)
    if test_number==1:
        song = pyglet.media.load(r'C:\Users\User\Downloads\windows_error_remix.mp3')
        song.play()
        pyglet.app.run()
        sys.exit()

    elif test_number==2:
        song = pyglet.media.load(r'C:\Users\User\Downloads\fnaf_2_death_scream.mp3')
        song.play()
        pyglet.app.run()
        sys.exit()