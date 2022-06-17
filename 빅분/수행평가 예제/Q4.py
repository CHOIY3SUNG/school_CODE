# 4. [0,1,2,....59]의 1차원 배열을 reshape를 사용하여 10열인 2차원 matrix을 만드시오.

import numpy as np

ar = np.array(range(60)).reshape(-1,10)

print(ar)