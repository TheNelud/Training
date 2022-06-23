from mimetypes import init
from re import L
from xml.dom.minidom import Element
from matplotlib.pyplot import title
from pandas import array
import plotly.graph_objects as go
from plotly.subplots import make_subplots
from dash import dcc

import psycopg2
from dash import html
import dash


def connection_data(dbname, user, password, host, port ):
    connection = psycopg2.connect(dbname=dbname, user = user, password=password, host=host, port= port)
    return connection.cursor()


def plotly_3dsurface():
    cursor = connection_data('dash', 'postgres', 'postgres', 'localhost', 5432)
    cursor.execute("SELECT * FROM skv")
    data = [element for element in cursor]
    x = []
    y = []
    z = []
    for i in range(len(data)):
        x.append(data[i][2])
        y.append(data[i][3])
        z.append(data[i][4])

    layout = go.Layout(
        title='Визуализация данных',
        autosize=False,
        width=1800,
        height=900,
        margin=go.Margin(l=100,r=100,b=0,t=30,pad=0)

    )
    figure = go.Figure(data=[go.Surface(z=z , x=x, y=y, visible=True )], layout=layout)
    return figure


app = dash.Dash()
app.layout = html.Div([
    html.A(html.Button('Назад', className='Back'),href='https://google.com/'),
    dcc.Graph(figure=plotly_3dsurface())
    ])

if __name__=="__main__":
    # dash_ebash()

    app.run_server(
        debug=True, 
        use_reloader=False, 
        host = 'localhost', 
        port = 1111
        )

