import imp
import shutil
from logging_less import test

logger = test.get_logger(__name__)

total_b, used_b, free_b = shutil.disk_usage('.')

gb = 10 **9


logger.info('Обьем: {:6.2f}'.format(total_b / gb))
logger.info('Использовано: {:6.2f}'.format(used_b / gb))
logger.info('Свободно: {:6.2f}'.format(free_b / gb))


