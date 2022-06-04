from django.contrib import admin

# Register your models here.
from .models import Category, News


class NewsAdmin(admin.ModelAdmin):
    list_display = ('id', 'title', 'create_at', 'update_at', 'is_published')
    list_display_links = ('id', 'title') #сделать ссылки 
    search_fields = ('title', 'content') #поиск по ...

admin.site.register(News,NewsAdmin)
admin.site.register(Category)
