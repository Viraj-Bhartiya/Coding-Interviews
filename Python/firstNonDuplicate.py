def oNSqr(str):
  for i in range(len(str)) :
    c = 0
    for j in range(len(str)) :
      if str[i] == str[j]:
        c +=1
    if c == 1:
      return str[i]
  return '_' 

print(oNSqr("aaabccc"))

def o2N(str):
  map = dict()
  for i in range(len(str)):
    if str[i] in map.keys():
      map[str[i]] = map[str[i]]+1
    else:
      map[str[i]] = 1
  
  for i in range(len(str)):
    if map.get(str[i]) == 1:
      return str[i]
  return '_'

print(o2N("aaabbbcdddd"))

def oN(str):
  for i in range(len(str)):
    if str.index(str[i]) == str.rindex(str[i]):
      return str[i]
  return '_'

print(oN("aaabbbcccdeee"))