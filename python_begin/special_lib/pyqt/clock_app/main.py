from tkinter import Label
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel

import sys


class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()

        self.setWindowTitle('clock')
        QLabel *label = new QLabel(this)

        button = QPushButton("Press me!")

        self.setCentralWidget(label_date)
        self.setCentralWidget(button)



if __name__=="__main__":
    app = QApplication(sys.argv)
    # mainWindow()
    window = MainWindow()
    window.show()
    app.exec()