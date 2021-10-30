package marketing.company.repo.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import marketing.company.domain.persistence.Albums;


@Repository
public interface AlbumsRepository extends JpaRepository<Albums, Long > {


//@Query
    //(value = "SELECT"
                //   +"at"
              //     +"FROM"
                //   +"AccountType at"
                   //+"WHERE at.mnemonic = :mnemonic ")
    //Geolocation




}
