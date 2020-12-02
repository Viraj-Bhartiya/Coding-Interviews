# # coords = {{1,2},{2,1}}
# def calc(coords,k):
#   distance = []
#   for i in range(len(coords)):
#     x  =coords[i][0]
#     y = coords[i][1]
#     distance.append(x*x + y*y)
  
#   distance.sort()
  
#   for i in  range(len(coords)):
#     x = coords[i][0]
#     y = coords[i][1]
#     if x*x+y*y == distance[i]:
#       print(distance[i])
      
# calc([[1,2],[3,4]])

def kClosest(points, K):
  points.sort(key = lambda P: P[0]**2 + P[1]**2)
  return points[:K]

print(kClosest([[1,1],[2,2]],1))