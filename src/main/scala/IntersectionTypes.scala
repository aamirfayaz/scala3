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
}