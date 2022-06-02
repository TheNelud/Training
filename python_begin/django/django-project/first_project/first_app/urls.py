from django.urls import path
from . import views

app_name = 'first_app'
urlpatterns = [
#     path('', views.index, name='index'),
#     # question_id -> pk
#     path('<int:pk>/', views.detail, name='detail'),
#     path('<int:pk>/results/', views.results, name='results'),
#     path('<int:question_id>/vote/', views.vote, name='vote'),

    
    path('', views.IndexView.as_view(), name='index'),
    # question_id -> pk
    path('<int:pk>/', views.DetailView.as_view(), name='detail'),
    path('<int:pk>/results/', views.ResultsView.as_view(), name='results'),
    path('<int:question_id>/vote/', views.vote, name='vote'),
    ]