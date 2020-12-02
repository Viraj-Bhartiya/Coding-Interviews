# Definition for singly-linked list:
class ListNode(object):
  def __init__(self, x):
    self.value = x
    self.next = None

def isListPalindrome(l):
  if not l or not l.next:
    return True
  s = 1
  n = l
  while n.next:
    n = n.next
    s += 1
  
  middle = s // 2
  
  n = l
  for i in range(middle):
    n = n.next
  
  if s % 2:
    n = n.next
  
  r = n # reverse n
  m = r.next
  for _ in range(middle-1): # flip n
    m.next,r,m = r,m,m.next
  
  for _ in range(middle):
    if r.value != l.value:
      return False
    r = r.next
    l = l.next
  
  return True