# 8. 두 배열의 각 요소별 대소를 비교하여 출력하시오.

import numpy as np

ar1 = np.arange(20).reshape(4, 5)
ar2 = np.array([[5,5,5,5,5], [5,5,5,5,5], [15,15,15,15,15], [15,15,15,15,15]])
print(ar1 > ar2)
print(ar1 < ar2)