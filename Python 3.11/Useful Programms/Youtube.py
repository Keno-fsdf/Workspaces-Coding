from pytube import YouTube
from sys import argv 

link = YouTube ("https://www.youtube.com/watch?v=5xgPjZ_y994")
print (link.title) #You can confirm if it is actually the video that you want 

yd = link.streams.get_highest_resolution()
yd.download(r"C:\Users\Keno\Desktop\YoutubeDownloads")


