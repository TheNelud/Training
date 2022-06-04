
from django.db import models

# Create your models here.

class News(models.Model):
    title = models.CharField(max_length=150, verbose_name="Наименование")
    content = models.TextField(blank=True, verbose_name='Контент')
    create_at = models.DateTimeField(auto_now_add=True, verbose_name='Дата создания')
    update_at = models.DateTimeField(auto_now=True,verbose_name='Дата обновления')
    photo = models.ImageField((""), upload_to='photos/%Y/%m/%d/', height_field=None, width_field=None, max_length=None, blank=True)
    is_published = models.BooleanField(default=True, verbose_name='Статус')
    category = models.ForeignKey('Category', on_delete=models.PROTECT, null=True, verbose_name='Категория')

    def my_func(sefl):
        return 'Hello from model'

    def __str__(self):
        return self.title


    class Meta:
        verbose_name = "Новость"
        verbose_name_plural = "новости"
        ordering = ['-create_at']


class Category(models.Model):
    title = models.CharField(max_length=150,db_index=True, verbose_name="Наименование")
    

    class Meta:
        verbose_name = ("Категории")
        verbose_name_plural = ("категории")
        ordering = ['title']

    def __str__(self):
        return self.title
