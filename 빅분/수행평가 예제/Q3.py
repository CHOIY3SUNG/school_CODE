# 3. [1,2,3,4,5,6]의 모든 가능한 2차원 martrix를 만드시오.
# [총 4개의 matrix, dtype=int]

import numpy as np

ar1 = np.array(range(1,7), dtype="int").reshape(-1, 6)
ar2 = np.array(range(1,7), dtype="int").reshape(2, 3)
ar3 = np.array(range(1,7), dtype="int").reshape(3, 2)
ar4 = np.array(range(1,7), dtype="int").reshape(6, -1)

# test
print(ar1)
print(ar2)
print(ar3)
print(ar4)