os.type = 'windows'
database {
	name = 'local'
	user = 'root'
	password = 'sec|_|re'
	bind.address = 'http://localhost:3306'
	flyway.clean = 'true'
}

environments {
	dev {
		database {
			name = 'dev'
			bind.address = 'http://dev.example.org:3306'
		}
	}
	
	'int' {
		os.type = 'linux'
		database {
			name = 'int'
			password = 'g3h3im'
			bind.address = 'http://int.example.org:3306'
			flyway.clean = 'false'
		}
	}
	
	prod {
		os.type = 'linux'
		database {
			name = 'proddb'
			password = 'sup3r_s3cUr3'
			bind.address = 'http://prod.example.org:3306'
			flyway.clean = 'false'
		}
	}
}