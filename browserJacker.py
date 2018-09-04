import webbrowser
import time
import random

while True:
    sites = random.choice(['cnn.com','puppies.com','youtube.com'])
    visit = "http://{}".format(sites)
    webbrowser.open(visit)
    seconds = random.randrange(5,100)
    seconds = random.randrange(5, 20)
    time.sleep(seconds)
