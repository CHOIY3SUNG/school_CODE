# 2. ar1, ar2 데이터의 해당하는 numpy ndarray를 만들고,
# dtype와 ndim을 출력하시오.

import numpy as np

ar1 = np.array([[1,2,3,4], [4,3,2,1]], dtype="float64")
ar2 = np.array([[1,2,3,4], [4,3,2,1], [1,2,3,4], [4,3,2,1]], dtype="int8")

# ar1
print(ar1)
print(ar1.dtype)
print(ar1.ndim)
# ar2
print(ar2)
print(ar2.dtype)
print(ar2.ndim)