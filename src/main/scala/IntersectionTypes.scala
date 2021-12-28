@main def intersectionTypes: Unit = {

	trait Camera {

		def takePhoto() = println("snap")
	}

	trait Phone {

		def makeCall() = println("ring ring")
	}

	def useSmartDevice(sp: Camera & Phone) = {
		sp.takePhoto()
		sp.makeCall()
	}

	class SmartPhone extends Camera with Phone

	useSmartDevice(new SmartPhone)

	trait Camera2 {

		def use() = println("camera use")
	}

	trait Phone2 {

		def use() = println("phone use")
	}

	def useSmartDevice2(sp: Camera2 & Phone2) = {
		sp.use()
	}

	class SmartPhone2 extends Camera2 with Phone2 {
		override def use() = println("smart use")
	}

	useSmartDevice2(new SmartPhone2)

	trait HostConfig
	trait HostController {
		def get: Option[HostConfig]
	}
	trait PortConfig
	trait PortController {
		def get: Option[PortConfig]
	}

	def getConfigs(controller: HostController & PortController): Option[HostConfig & PortConfig] = {
		controller.get
	}

// class Config extends HostConfig CTE
class Config extends HostConfig with PortConfig


	class Controller extends HostController with PortController {
		//override def get = None
		override def get:Option[HostConfig & PortConfig] = Some(new Config)
	}
}