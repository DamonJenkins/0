os.loadAPI("passLock/passLock")
one, two = passLock.login("f/file.cfg")
if one then
  term.clear()
  term.setCursorPos(1,1)
  term.setTextColour(colours.white)
  print(two)
end
