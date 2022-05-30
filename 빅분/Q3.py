# 3. [1,2,3,4,5,6]의 모든 가능한 2차원 martrix를 만드시오.
# [총 4개의 matrix, dtype=int]

import numpy as np

ar1 = np.matrix([1,2,3,4,5,6], dtype="int")
ar2 = np.matrix([[1,2,3],[4,5,6]], dtype="int")
ar3 = np.matrix([[1,2],[3,4],[5,6]], dtype="int")
ar4 = np.matrix([[1],[2],[3],[4],[5],[6]], dtype="int")

print(ar1)
print(ar2)
print(ar3)
print(ar4)