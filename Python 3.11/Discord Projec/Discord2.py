import discord

class MyClient(discord.Client):
    #Einlogen
    async def on_ready(self):
        print("Ich hab mich eingeloggt")
    
    #Wenn Nachricht geposte wird
    async def on_message(self, message):
        print ("Nachricht von " + message.author + " enthält" + message.content)

client = discord.Client(intents=discord.Intents.default())
client.run("MTEzMDQ4NDIyNDU1NDcwOTA3Mw.G7tc6s.X3xEI8xa3cQEK5EVVf79mYE8wppjqiTdvwdDtE")