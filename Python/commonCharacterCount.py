def commonCharacterCount(s1, s2):
  s1_list=list(s1)
  s2_list=list(s2)
  common=0
  for i in s1_list:
    for s in s2_list:
      if i==s:
        common+=1
        s2_list.remove(s)
        break
  return common

def commonCharacterCount(s1, s2):
    com = [min(s1.count(i),s2.count(i)) for i in set(s1)]
    return sum(com)
  
