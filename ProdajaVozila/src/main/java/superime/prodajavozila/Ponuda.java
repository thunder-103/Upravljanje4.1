package superime.prodajavozila;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Ponuda")
public class Ponuda implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("PonudaID")
   private java.lang.Long ponudaID;
   @org.kie.api.definition.type.Label("KupacID")
   private Kupac kupacID;

   @org.kie.api.definition.type.Label("VoziloID")
   private superime.prodajavozila.Vozilo voziloID;

   @org.kie.api.definition.type.Label("NarudzbaVozila")
   private java.lang.Boolean narudzba_vozila;

   @org.kie.api.definition.type.Label("LagerVozilo")
   private java.lang.Boolean lager_vozilo;

   @org.kie.api.definition.type.Label("NastavakPregovora")
   private java.lang.Boolean nastavak_pregovora;

   @org.kie.api.definition.type.Label("Placeno")
   private java.lang.Boolean placeno;

   @org.kie.api.definition.type.Label("Isporuceno")
   private java.lang.Boolean isporuceno;

   @org.kie.api.definition.type.Label("FollowUp")
   private java.lang.String follow_up;

   public Ponuda()
   {
   }

   public java.lang.Long getPonudaID()
   {
      return this.ponudaID;
   }

   public void setPonudaID(java.lang.Long ponudaID)
   {
      this.ponudaID = ponudaID;
   }

   public superime.prodajavozila.Vozilo getVoziloID()
   {
      return this.voziloID;
   }

   public void setVoziloID(superime.prodajavozila.Vozilo voziloID)
   {
      this.voziloID = voziloID;
   }

   public java.lang.Boolean getNarudzba_vozila()
   {
      return this.narudzba_vozila;
   }

   public void setNarudzba_vozila(java.lang.Boolean narudzba_vozila)
   {
      this.narudzba_vozila = narudzba_vozila;
   }

   public java.lang.Boolean getLager_vozilo()
   {
      return this.lager_vozilo;
   }

   public void setLager_vozilo(java.lang.Boolean lager_vozilo)
   {
      this.lager_vozilo = lager_vozilo;
   }

   public java.lang.Boolean getNastavak_pregovora()
   {
      return this.nastavak_pregovora;
   }

   public void setNastavak_pregovora(java.lang.Boolean nastavak_pregovora)
   {
      this.nastavak_pregovora = nastavak_pregovora;
   }

   public java.lang.Boolean getPlaceno()
   {
      return this.placeno;
   }

   public void setPlaceno(java.lang.Boolean placeno)
   {
      this.placeno = placeno;
   }

   public java.lang.Boolean getIsporuceno()
   {
      return this.isporuceno;
   }

   public void setIsporuceno(java.lang.Boolean isporuceno)
   {
      this.isporuceno = isporuceno;
   }

   public java.lang.String getFollow_up()
   {
      return this.follow_up;
   }

   public void setFollow_up(java.lang.String follow_up)
   {
      this.follow_up = follow_up;
   }

   public superime.prodajavozila.Kupac getKupacID()
   {
      return this.kupacID;
   }

   public void setKupacID(superime.prodajavozila.Kupac kupacID)
   {
      this.kupacID = kupacID;
   }

   public Ponuda(java.lang.Long ponudaID, superime.prodajavozila.Kupac kupacID,
         superime.prodajavozila.Vozilo voziloID,
         java.lang.Boolean narudzba_vozila, java.lang.Boolean lager_vozilo,
         java.lang.Boolean nastavak_pregovora, java.lang.Boolean placeno,
         java.lang.Boolean isporuceno, java.lang.String follow_up)
   {
      this.ponudaID = ponudaID;
      this.kupacID = kupacID;
      this.voziloID = voziloID;
      this.narudzba_vozila = narudzba_vozila;
      this.lager_vozilo = lager_vozilo;
      this.nastavak_pregovora = nastavak_pregovora;
      this.placeno = placeno;
      this.isporuceno = isporuceno;
      this.follow_up = follow_up;
   }

}