# 7. a,b를 활용하여 아래의 식을 계산하시오. (broadcasting 사용)

import numpy as np

a = np.array(range(1, 35, 3)).reshape(4, 3)
b = np.array([1,2,3,4]).reshape(4,1)
print(a+b)