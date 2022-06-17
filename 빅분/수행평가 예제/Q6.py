# arange를 활용하여 a dhk rkxdms array를 만들고,
# 그후 slicing을 사용하여 b와 같은 array를 만드시오.
#
# a) [[ 0  1  2  3  4  5  6  7  8  9 10 11]
#    [12 13 14 15 16 17 18 19 20 21 22 23]]
# b) [[ 0  4  8]
#    [12 16 20]]

import numpy as np

a = np.arange(24).reshape(2, 12)

b = a[:, ::4]