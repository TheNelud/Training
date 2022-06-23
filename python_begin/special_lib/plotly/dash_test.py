from urllib import response
from matplotlib import colors
import requests
import pandas as pd

import dash
# import dash_core_components as dcc
from dash import dcc
from dash import html
# import dash_html_components as html

app = dash.Dash(__name__)


colors = {
    'background' : '#111111',
    'text' : '#7FDBFF'
}

app.layout = html.Div(style={'backgroundColor' : colors['background']},children=[
    
    html.Title('Визуализация данных журнала'),

    html.H1(
        children='Визуализация данных ',
        style={
            'color' : colors['text']
            }
        ),

    dcc.Graph(
        id='3dplot',
        figure={
            'data':[
                {'x':[1,2,3], 'y':[4,1,2], 'type':'bar', 'name':'Table1'},
                {'x':[1,2,3], 'y':[3,4,1], 'type':'bar', 'name':'Table2'},

            ],
            'layout':{
                'title': 'Dash Data Visialization'
            }
        }
    )
])




if __name__=='__main__':
    app.run_server(debug=True)