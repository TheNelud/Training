# Стандартное импортирование plotly
from chart_studio import plotly
# import plotly.plotly as py
import plotly.graph_objs as go
from plotly.offline import iplot

# Использование cufflinks в офлайн-режиме
import cufflinks
cufflinks.go_offline()

# Настройка глобальной темы cufflinks
cufflinks.set_config_file(world_readable=True, theme='pearl', offline=True)

df['claps'].iplot(kind='hist', xTitle='claps',
                  yTitle='count', title='Claps Distribution')