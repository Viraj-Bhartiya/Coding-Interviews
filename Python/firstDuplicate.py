def firstDuplicate(look_here):
    have_seen = set()
    for item in look_here:
        if item in have_seen:
            return item
        have_seen.add(item)
    return -1