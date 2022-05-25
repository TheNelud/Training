
import shutil, loger


logger = loger.get_logger(__name__)

total_b, used_b, free_b = shutil.disk_usage('.')

gb = 10 **9


logger.info('Обьем: {:6.2f}'.format(total_b / gb))
logger.warning('Использовано: {:6.2f}'.format(used_b / gb))
logger.debug('Свободно: {:6.2f}'.format(free_b / gb))

