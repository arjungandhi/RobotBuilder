#set($command = $helper.getByName($command-name, $robot))

#class($command.name)::#class($command.name)(double timeout) : TimedCommand(timeout) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
#@autogenerated_code("requires", "    ")
#parse("${exporter-path}Command-requires.cpp")
#end
}