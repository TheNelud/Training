from matplotlib import projections
import matplotlib.pyplot as plt
import numpy

from matplotlib.colors import LinearSegmentedColormap

from matplotlib import cm


def makeData():
    #Строим сетку в интервале от -10 до 10, имеющую 100 отсчетов по обоим координатам
    x = numpy.linspace(-10, 10, 100)
    y = numpy.linspace(-10, 10, 100)

    #Создаем двумерную матрицу-сетку
    x_grid, y_grid = numpy.meshgrid(x, y)

    #В узлах рассчитываем матрицу-сетку
    z = numpy.sin (x_grid) * numpy.sin (y_grid) / (x_grid * y_grid)

    return x_grid, y_grid, z


if __name__ == '__main__':
    print(dir(cm)) #какие цветовые карты есть


    x, y, z = makeData()
    figure = plt.figure(figsize=(10, 8))
    cmap = LinearSegmentedColormap.from_list('red_blue', ['b','w', 'r'], 256) 

    axes = figure.add_subplot(1, 2, 1, projection='3d')
    axes.set_title("Defualt")
    axes.plot_surface(x, y, z, rcount=100, ccount=100, cmap=cmap , shade=True) #rcount= 20, ccount=20 размеры сетки из которой сториться фигура
                                                                # rcount и ccount задавали количество отсчетов по осям, 
                                                                # то rstride и cstride задают степень прореженности (децимации) по осям
                                                                # color='yellow'
    # axes_new = figure.add_subplot(1, 2, 2, projection='3d')
    # axes_new.set_title("New Diagramm")
    # axes_new.plot_surface(x, y, z, rcount= 50, ccount=50, cmap='Spectral', shade=True)


    plt.show()





