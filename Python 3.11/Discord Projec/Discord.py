import discord
import os

class MyClient(discord.Client):
    async def on_ready(self):
        print('Logged on as', self.user)

    async def on_message(self, message):
        # don't respond to ourselves
        if message.author == self.user:
            return

        if message.content == 'ping':
            await message.channel.send('pong')

        
        

       

intents = discord.Intents.default()
intents.message_content = True
client = MyClient(intents=intents)
client.run('MTEzMDQ4NDIyNDU1NDcwOTA3Mw.Giw81-.h7ZUnyEuVDyC-M3cWIRe7g1zkk_QQZQmKtrbIU')