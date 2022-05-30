from django.shortcuts import render
from .models import VisData
from .utils import get_plot
# Create your views here.

def main_view(request):
    qs = VisData.objects.all()
    x = [x.item for x in qs]
    y = [y.item for y in qs]
    chart = get_plot(x, y)
    return render(request, 'visual_data/main.html', {'chart': chart})