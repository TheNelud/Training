from datetime import datetime
import schedule
import time


def job1():
    print(f"I'm working...1: " + str(datetime.now()))

def job2():
    print(f"I'm working...2: " + str(datetime.now()))

def job3():
    print(f"I'm working...3: " + str(datetime.now()))

schedule.every(5).minutes.at(":00").do(job3)
schedule.every().hour.at(":00").do(job1)
schedule.every().day.at("10:00:00").do(job2)

print(schedule.get_jobs())




while True:
    schedule.run_pending()
    time.sleep(1)